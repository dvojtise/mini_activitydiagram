/*
* generated by Xtext
*/
package org.modelexecution.operationalsemantics.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.modelexecution.operationalsemantics.services.ActivityDiagramGrammarAccess;

public class ActivityDiagramParser extends AbstractContentAssistParser {
	
	@Inject
	private ActivityDiagramGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.modelexecution.operationalsemantics.ui.contentassist.antlr.internal.InternalActivityDiagramParser createParser() {
		org.modelexecution.operationalsemantics.ui.contentassist.antlr.internal.InternalActivityDiagramParser result = new org.modelexecution.operationalsemantics.ui.contentassist.antlr.internal.InternalActivityDiagramParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActivityNodeAccess().getAlternatives(), "rule__ActivityNode__Alternatives");
					put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getIntegerCalculationOperatorAccess().getAlternatives(), "rule__IntegerCalculationOperator__Alternatives");
					put(grammarAccess.getIntegerComparisonOperatorAccess().getAlternatives(), "rule__IntegerComparisonOperator__Alternatives");
					put(grammarAccess.getBooleanBinaryOperatorAccess().getAlternatives(), "rule__BooleanBinaryOperator__Alternatives");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getActivityAccess().getGroup_3(), "rule__Activity__Group_3__0");
					put(grammarAccess.getActivityAccess().getGroup_3_2(), "rule__Activity__Group_3_2__0");
					put(grammarAccess.getActivityAccess().getGroup_5(), "rule__Activity__Group_5__0");
					put(grammarAccess.getActivityAccess().getGroup_5_1(), "rule__Activity__Group_5_1__0");
					put(grammarAccess.getActivityAccess().getGroup_6(), "rule__Activity__Group_6__0");
					put(grammarAccess.getActivityAccess().getGroup_6_3(), "rule__Activity__Group_6_3__0");
					put(grammarAccess.getActivityAccess().getGroup_7(), "rule__Activity__Group_7__0");
					put(grammarAccess.getActivityAccess().getGroup_7_3(), "rule__Activity__Group_7_3__0");
					put(grammarAccess.getOpaqueActionAccess().getGroup(), "rule__OpaqueAction__Group__0");
					put(grammarAccess.getOpaqueActionAccess().getGroup_3(), "rule__OpaqueAction__Group_3__0");
					put(grammarAccess.getOpaqueActionAccess().getGroup_3_3(), "rule__OpaqueAction__Group_3_3__0");
					put(grammarAccess.getOpaqueActionAccess().getGroup_4(), "rule__OpaqueAction__Group_4__0");
					put(grammarAccess.getOpaqueActionAccess().getGroup_4_3(), "rule__OpaqueAction__Group_4_3__0");
					put(grammarAccess.getOpaqueActionAccess().getGroup_5(), "rule__OpaqueAction__Group_5__0");
					put(grammarAccess.getOpaqueActionAccess().getGroup_5_3(), "rule__OpaqueAction__Group_5_3__0");
					put(grammarAccess.getInitialNodeAccess().getGroup(), "rule__InitialNode__Group__0");
					put(grammarAccess.getInitialNodeAccess().getGroup_3(), "rule__InitialNode__Group_3__0");
					put(grammarAccess.getInitialNodeAccess().getGroup_3_3(), "rule__InitialNode__Group_3_3__0");
					put(grammarAccess.getActivityFinalNodeAccess().getGroup(), "rule__ActivityFinalNode__Group__0");
					put(grammarAccess.getActivityFinalNodeAccess().getGroup_3(), "rule__ActivityFinalNode__Group_3__0");
					put(grammarAccess.getActivityFinalNodeAccess().getGroup_3_3(), "rule__ActivityFinalNode__Group_3_3__0");
					put(grammarAccess.getForkNodeAccess().getGroup(), "rule__ForkNode__Group__0");
					put(grammarAccess.getForkNodeAccess().getGroup_3(), "rule__ForkNode__Group_3__0");
					put(grammarAccess.getForkNodeAccess().getGroup_4(), "rule__ForkNode__Group_4__0");
					put(grammarAccess.getForkNodeAccess().getGroup_4_3(), "rule__ForkNode__Group_4_3__0");
					put(grammarAccess.getJoinNodeAccess().getGroup(), "rule__JoinNode__Group__0");
					put(grammarAccess.getJoinNodeAccess().getGroup_3(), "rule__JoinNode__Group_3__0");
					put(grammarAccess.getJoinNodeAccess().getGroup_3_3(), "rule__JoinNode__Group_3_3__0");
					put(grammarAccess.getJoinNodeAccess().getGroup_4(), "rule__JoinNode__Group_4__0");
					put(grammarAccess.getMergeNodeAccess().getGroup(), "rule__MergeNode__Group__0");
					put(grammarAccess.getMergeNodeAccess().getGroup_3(), "rule__MergeNode__Group_3__0");
					put(grammarAccess.getMergeNodeAccess().getGroup_3_3(), "rule__MergeNode__Group_3_3__0");
					put(grammarAccess.getMergeNodeAccess().getGroup_4(), "rule__MergeNode__Group_4__0");
					put(grammarAccess.getDecisionNodeAccess().getGroup(), "rule__DecisionNode__Group__0");
					put(grammarAccess.getDecisionNodeAccess().getGroup_3(), "rule__DecisionNode__Group_3__0");
					put(grammarAccess.getDecisionNodeAccess().getGroup_4(), "rule__DecisionNode__Group_4__0");
					put(grammarAccess.getDecisionNodeAccess().getGroup_4_3(), "rule__DecisionNode__Group_4_3__0");
					put(grammarAccess.getIntegerCalculationExpressionAccess().getGroup(), "rule__IntegerCalculationExpression__Group__0");
					put(grammarAccess.getIntegerComparisonExpressionAccess().getGroup(), "rule__IntegerComparisonExpression__Group__0");
					put(grammarAccess.getBooleanUnaryExpressionAccess().getGroup(), "rule__BooleanUnaryExpression__Group__0");
					put(grammarAccess.getBooleanBinaryExpressionAccess().getGroup(), "rule__BooleanBinaryExpression__Group__0");
					put(grammarAccess.getIntegerVariableAccess().getGroup(), "rule__IntegerVariable__Group__0");
					put(grammarAccess.getIntegerVariableAccess().getGroup_3(), "rule__IntegerVariable__Group_3__0");
					put(grammarAccess.getBooleanVariableAccess().getGroup(), "rule__BooleanVariable__Group__0");
					put(grammarAccess.getBooleanVariableAccess().getGroup_3(), "rule__BooleanVariable__Group_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getControlFlowAccess().getGroup(), "rule__ControlFlow__Group__0");
					put(grammarAccess.getControlFlowAccess().getGroup_6(), "rule__ControlFlow__Group_6__0");
					put(grammarAccess.getActivityAccess().getNameAssignment_2(), "rule__Activity__NameAssignment_2");
					put(grammarAccess.getActivityAccess().getInputsAssignment_3_1(), "rule__Activity__InputsAssignment_3_1");
					put(grammarAccess.getActivityAccess().getInputsAssignment_3_2_1(), "rule__Activity__InputsAssignment_3_2_1");
					put(grammarAccess.getActivityAccess().getLocalsAssignment_5_0(), "rule__Activity__LocalsAssignment_5_0");
					put(grammarAccess.getActivityAccess().getLocalsAssignment_5_1_1(), "rule__Activity__LocalsAssignment_5_1_1");
					put(grammarAccess.getActivityAccess().getNodesAssignment_6_2(), "rule__Activity__NodesAssignment_6_2");
					put(grammarAccess.getActivityAccess().getNodesAssignment_6_3_1(), "rule__Activity__NodesAssignment_6_3_1");
					put(grammarAccess.getActivityAccess().getEdgesAssignment_7_2(), "rule__Activity__EdgesAssignment_7_2");
					put(grammarAccess.getActivityAccess().getEdgesAssignment_7_3_1(), "rule__Activity__EdgesAssignment_7_3_1");
					put(grammarAccess.getOpaqueActionAccess().getNameAssignment_2(), "rule__OpaqueAction__NameAssignment_2");
					put(grammarAccess.getOpaqueActionAccess().getExpressionsAssignment_3_2(), "rule__OpaqueAction__ExpressionsAssignment_3_2");
					put(grammarAccess.getOpaqueActionAccess().getExpressionsAssignment_3_3_1(), "rule__OpaqueAction__ExpressionsAssignment_3_3_1");
					put(grammarAccess.getOpaqueActionAccess().getIncomingAssignment_4_2(), "rule__OpaqueAction__IncomingAssignment_4_2");
					put(grammarAccess.getOpaqueActionAccess().getIncomingAssignment_4_3_1(), "rule__OpaqueAction__IncomingAssignment_4_3_1");
					put(grammarAccess.getOpaqueActionAccess().getOutgoingAssignment_5_2(), "rule__OpaqueAction__OutgoingAssignment_5_2");
					put(grammarAccess.getOpaqueActionAccess().getOutgoingAssignment_5_3_1(), "rule__OpaqueAction__OutgoingAssignment_5_3_1");
					put(grammarAccess.getInitialNodeAccess().getNameAssignment_2(), "rule__InitialNode__NameAssignment_2");
					put(grammarAccess.getInitialNodeAccess().getOutgoingAssignment_3_2(), "rule__InitialNode__OutgoingAssignment_3_2");
					put(grammarAccess.getInitialNodeAccess().getOutgoingAssignment_3_3_1(), "rule__InitialNode__OutgoingAssignment_3_3_1");
					put(grammarAccess.getActivityFinalNodeAccess().getNameAssignment_2(), "rule__ActivityFinalNode__NameAssignment_2");
					put(grammarAccess.getActivityFinalNodeAccess().getIncomingAssignment_3_2(), "rule__ActivityFinalNode__IncomingAssignment_3_2");
					put(grammarAccess.getActivityFinalNodeAccess().getIncomingAssignment_3_3_1(), "rule__ActivityFinalNode__IncomingAssignment_3_3_1");
					put(grammarAccess.getForkNodeAccess().getNameAssignment_2(), "rule__ForkNode__NameAssignment_2");
					put(grammarAccess.getForkNodeAccess().getIncomingAssignment_3_2(), "rule__ForkNode__IncomingAssignment_3_2");
					put(grammarAccess.getForkNodeAccess().getOutgoingAssignment_4_2(), "rule__ForkNode__OutgoingAssignment_4_2");
					put(grammarAccess.getForkNodeAccess().getOutgoingAssignment_4_3_1(), "rule__ForkNode__OutgoingAssignment_4_3_1");
					put(grammarAccess.getJoinNodeAccess().getNameAssignment_2(), "rule__JoinNode__NameAssignment_2");
					put(grammarAccess.getJoinNodeAccess().getIncomingAssignment_3_2(), "rule__JoinNode__IncomingAssignment_3_2");
					put(grammarAccess.getJoinNodeAccess().getIncomingAssignment_3_3_1(), "rule__JoinNode__IncomingAssignment_3_3_1");
					put(grammarAccess.getJoinNodeAccess().getOutgoingAssignment_4_2(), "rule__JoinNode__OutgoingAssignment_4_2");
					put(grammarAccess.getMergeNodeAccess().getNameAssignment_2(), "rule__MergeNode__NameAssignment_2");
					put(grammarAccess.getMergeNodeAccess().getIncomingAssignment_3_2(), "rule__MergeNode__IncomingAssignment_3_2");
					put(grammarAccess.getMergeNodeAccess().getIncomingAssignment_3_3_1(), "rule__MergeNode__IncomingAssignment_3_3_1");
					put(grammarAccess.getMergeNodeAccess().getOutgoingAssignment_4_2(), "rule__MergeNode__OutgoingAssignment_4_2");
					put(grammarAccess.getDecisionNodeAccess().getNameAssignment_2(), "rule__DecisionNode__NameAssignment_2");
					put(grammarAccess.getDecisionNodeAccess().getIncomingAssignment_3_2(), "rule__DecisionNode__IncomingAssignment_3_2");
					put(grammarAccess.getDecisionNodeAccess().getOutgoingAssignment_4_2(), "rule__DecisionNode__OutgoingAssignment_4_2");
					put(grammarAccess.getDecisionNodeAccess().getOutgoingAssignment_4_3_1(), "rule__DecisionNode__OutgoingAssignment_4_3_1");
					put(grammarAccess.getIntegerCalculationExpressionAccess().getAssigneeAssignment_0(), "rule__IntegerCalculationExpression__AssigneeAssignment_0");
					put(grammarAccess.getIntegerCalculationExpressionAccess().getOperand1Assignment_2(), "rule__IntegerCalculationExpression__Operand1Assignment_2");
					put(grammarAccess.getIntegerCalculationExpressionAccess().getOperatorAssignment_3(), "rule__IntegerCalculationExpression__OperatorAssignment_3");
					put(grammarAccess.getIntegerCalculationExpressionAccess().getOperand2Assignment_4(), "rule__IntegerCalculationExpression__Operand2Assignment_4");
					put(grammarAccess.getIntegerComparisonExpressionAccess().getAssigneeAssignment_0(), "rule__IntegerComparisonExpression__AssigneeAssignment_0");
					put(grammarAccess.getIntegerComparisonExpressionAccess().getOperand1Assignment_2(), "rule__IntegerComparisonExpression__Operand1Assignment_2");
					put(grammarAccess.getIntegerComparisonExpressionAccess().getOperatorAssignment_3(), "rule__IntegerComparisonExpression__OperatorAssignment_3");
					put(grammarAccess.getIntegerComparisonExpressionAccess().getOperand2Assignment_4(), "rule__IntegerComparisonExpression__Operand2Assignment_4");
					put(grammarAccess.getBooleanUnaryExpressionAccess().getAssigneeAssignment_0(), "rule__BooleanUnaryExpression__AssigneeAssignment_0");
					put(grammarAccess.getBooleanUnaryExpressionAccess().getOperatorAssignment_2(), "rule__BooleanUnaryExpression__OperatorAssignment_2");
					put(grammarAccess.getBooleanUnaryExpressionAccess().getOperandAssignment_3(), "rule__BooleanUnaryExpression__OperandAssignment_3");
					put(grammarAccess.getBooleanBinaryExpressionAccess().getAssigneeAssignment_0(), "rule__BooleanBinaryExpression__AssigneeAssignment_0");
					put(grammarAccess.getBooleanBinaryExpressionAccess().getOperand1Assignment_2(), "rule__BooleanBinaryExpression__Operand1Assignment_2");
					put(grammarAccess.getBooleanBinaryExpressionAccess().getOperatorAssignment_3(), "rule__BooleanBinaryExpression__OperatorAssignment_3");
					put(grammarAccess.getBooleanBinaryExpressionAccess().getOperand2Assignment_4(), "rule__BooleanBinaryExpression__Operand2Assignment_4");
					put(grammarAccess.getIntegerVariableAccess().getNameAssignment_2(), "rule__IntegerVariable__NameAssignment_2");
					put(grammarAccess.getIntegerVariableAccess().getInitialValueAssignment_3_1(), "rule__IntegerVariable__InitialValueAssignment_3_1");
					put(grammarAccess.getBooleanVariableAccess().getNameAssignment_2(), "rule__BooleanVariable__NameAssignment_2");
					put(grammarAccess.getBooleanVariableAccess().getInitialValueAssignment_3_1(), "rule__BooleanVariable__InitialValueAssignment_3_1");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
					put(grammarAccess.getIntegerValueAccess().getValueAssignment(), "rule__IntegerValue__ValueAssignment");
					put(grammarAccess.getControlFlowAccess().getNameAssignment_1(), "rule__ControlFlow__NameAssignment_1");
					put(grammarAccess.getControlFlowAccess().getSourceAssignment_3(), "rule__ControlFlow__SourceAssignment_3");
					put(grammarAccess.getControlFlowAccess().getTargetAssignment_5(), "rule__ControlFlow__TargetAssignment_5");
					put(grammarAccess.getControlFlowAccess().getGuardAssignment_6_1(), "rule__ControlFlow__GuardAssignment_6_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.modelexecution.operationalsemantics.ui.contentassist.antlr.internal.InternalActivityDiagramParser typedParser = (org.modelexecution.operationalsemantics.ui.contentassist.antlr.internal.InternalActivityDiagramParser) parser;
			typedParser.entryRuleActivity();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ActivityDiagramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActivityDiagramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
