// Generated from C:/Users/vyach/projects/sim-it/src/main/java/sim/antlr\SIMIT.g4 by ANTLR 4.8
package sim.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SIMITParser}.
 */
public interface SIMITListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SIMITParser#mainblock}.
	 * @param ctx the parse tree
	 */
	void enterMainblock(SIMITParser.MainblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#mainblock}.
	 * @param ctx the parse tree
	 */
	void exitMainblock(SIMITParser.MainblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#initEnv}.
	 * @param ctx the parse tree
	 */
	void enterInitEnv(SIMITParser.InitEnvContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#initEnv}.
	 * @param ctx the parse tree
	 */
	void exitInitEnv(SIMITParser.InitEnvContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#initIterations}.
	 * @param ctx the parse tree
	 */
	void enterInitIterations(SIMITParser.InitIterationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#initIterations}.
	 * @param ctx the parse tree
	 */
	void exitInitIterations(SIMITParser.InitIterationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#initPop}.
	 * @param ctx the parse tree
	 */
	void enterInitPop(SIMITParser.InitPopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#initPop}.
	 * @param ctx the parse tree
	 */
	void exitInitPop(SIMITParser.InitPopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#initEnvVar}.
	 * @param ctx the parse tree
	 */
	void enterInitEnvVar(SIMITParser.InitEnvVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#initEnvVar}.
	 * @param ctx the parse tree
	 */
	void exitInitEnvVar(SIMITParser.InitEnvVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#initPopVar}.
	 * @param ctx the parse tree
	 */
	void enterInitPopVar(SIMITParser.InitPopVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#initPopVar}.
	 * @param ctx the parse tree
	 */
	void exitInitPopVar(SIMITParser.InitPopVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#popSize}.
	 * @param ctx the parse tree
	 */
	void enterPopSize(SIMITParser.PopSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#popSize}.
	 * @param ctx the parse tree
	 */
	void exitPopSize(SIMITParser.PopSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SIMITParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SIMITParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#ru}.
	 * @param ctx the parse tree
	 */
	void enterRu(SIMITParser.RuContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#ru}.
	 * @param ctx the parse tree
	 */
	void exitRu(SIMITParser.RuContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(SIMITParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(SIMITParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber_expression(SIMITParser.Number_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber_expression(SIMITParser.Number_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(SIMITParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(SIMITParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#rand_function}.
	 * @param ctx the parse tree
	 */
	void enterRand_function(SIMITParser.Rand_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#rand_function}.
	 * @param ctx the parse tree
	 */
	void exitRand_function(SIMITParser.Rand_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#max_function}.
	 * @param ctx the parse tree
	 */
	void enterMax_function(SIMITParser.Max_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#max_function}.
	 * @param ctx the parse tree
	 */
	void exitMax_function(SIMITParser.Max_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#min_function}.
	 * @param ctx the parse tree
	 */
	void enterMin_function(SIMITParser.Min_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#min_function}.
	 * @param ctx the parse tree
	 */
	void exitMin_function(SIMITParser.Min_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(SIMITParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(SIMITParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#number_comparison}.
	 * @param ctx the parse tree
	 */
	void enterNumber_comparison(SIMITParser.Number_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#number_comparison}.
	 * @param ctx the parse tree
	 */
	void exitNumber_comparison(SIMITParser.Number_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#logical_operation}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operation(SIMITParser.Logical_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#logical_operation}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operation(SIMITParser.Logical_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_rule(SIMITParser.If_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_rule(SIMITParser.If_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SIMITParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(SIMITParser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SIMITParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(SIMITParser.Aggregate_functionContext ctx);
}