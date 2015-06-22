import 'platform:/resource/org.modelexecution.operationalsemantics.ad/ad/activitydiagram.ecore'
--http://activitydiagram/1.0
 
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib" 
    
package activitydiagram
 
	context ActivityNode
		def : executeIt : Event = self.execute() 
--		def : finishIt : Event = self
		
	context Activity
		def : start : Event = self.initialize() 
		def : finish : Event = self.finish() 
	 
	context ControlFlow
		def if (self.guard <> null): evalFalse : Event = self.clearOffer()
		def if (self.guard <> null): evalTrue : Event = self
		def if (self.guard <> null): evaluate : Event = self.evaluateGuard()[res] switch
														case false force evalFalse;
														case true force evalTrue;
	context ControlFlow
		inv trueOrFalse:
			(self.guard <> null) implies
			(Relation Exclusion(self.evalTrue, self.evalFalse))
		inv evalImpliesTrueOrFalse:
			(self.guard <> null) implies
			let TrueAndFalse : Event = Expression Union (self.evalTrue, self.evalFalse) in
			(Relation Precedes(self.evaluate, TrueAndFalse))														
		inv evalwhenSourceExec:
			(self.guard <> null) implies
			(Relation Coincides(self.source.executeIt, self.evaluate))

	context ActivityNode
		
		inv waitControlToExecute:
		((not ((self).oclIsKindOf(MergeNode)))
		and
		(self.incoming->size() > 1)
		and (self.incoming.oclAsType(ControlFlow).guard->first() = null)
		)implies
			let incomingFinished : Event = Expression Sup(self.incoming.source.executeIt) in
			(Relation Precedes(incomingFinished, self.executeIt)) 
		
		inv waitControlToExecute2:
		((not ((self).oclIsKindOf(MergeNode)))
		and
		(self.incoming->size() = 1)
		and (self.incoming->first().oclAsType(ControlFlow).guard = null)
		)implies
			(Relation Precedes(self.incoming->first().source.executeIt, self.executeIt)) 
	
		inv waitControlToExecute3:
		((not ((self).oclIsKindOf(MergeNode)))
		and
		(self.incoming->size() = 1)
	    and (self.incoming->first().oclAsType(ControlFlow).guard <> null)
		)implies
		(Relation Precedes(self.incoming->first().oclAsType(ControlFlow).evalTrue, self.executeIt)) 
	
--	context ExecutableNode
--		inv startBeforeFinish4ExecutableNode:
--			Relation Precedes(startIt,finishIt) 
	 
--	context ControlNode	
--		inv startBeforeFinish4nonExecutableNode:
--			Relation Precedes(startIt,finishIt)
		
	context Activity
		--def : referenceClock : Event = undefined
		inv NonReentrant:
			Relation Alternates(self.start, self.finish)
	
	context DecisionNode

		inv DecisionCausalities:
			let unionOfChoices : Event = Expression Union(self.outgoing->asSequence().target.executeIt) in
			(Relation Precedes(executeIt , unionOfChoices))
		inv DecisionExclusion:
			Relation Exclusion(self.outgoing->asSequence().target.executeIt) 

	context MergeNode
		inv MergeCausalities:
			let unionOfIncomes : Event = Expression Union(self.incoming.source.executeIt) in
			(Relation Precedes(unionOfIncomes, executeIt ))
	
	context InitialNode
		inv startedWhenActivityStart:
			Relation Precedes(self.activity.start, self.executeIt  )
			
	context ActivityFinalNode
		inv finishWhenActivityFinished:
			Relation Coincides(self.executeIt , self.activity.finish)
--
--		inv startBeforeFinishFinalNode:
--			Relation Precedes(startIt,finishIt)
	context Activity
		inv runOnlyOnce:
			let firstStart : Event = Expression OneTickAndNoMore(self.start) in
			Relation Coincides(self.start, firstStart)

endpackage