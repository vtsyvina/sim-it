// Generated from C:/Users/vyach/projects/sim-it/src/main/java/sim/antlr\SIMIT.g4 by ANTLR 4.8
package sim.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SIMITParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SIMITVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SIMITParser#mainblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainblock(SIMITParser.MainblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#initEnv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitEnv(SIMITParser.InitEnvContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#initIterations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitIterations(SIMITParser.InitIterationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#initPop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitPop(SIMITParser.InitPopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#initEnvVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitEnvVar(SIMITParser.InitEnvVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#initPopVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitPopVar(SIMITParser.InitPopVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#popSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopSize(SIMITParser.PopSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SIMITParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#ru}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRu(SIMITParser.RuContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(SIMITParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#number_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_expression(SIMITParser.Number_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(SIMITParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#rand_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRand_function(SIMITParser.Rand_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#max_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_function(SIMITParser.Max_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#min_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin_function(SIMITParser.Min_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#individual_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_var(SIMITParser.Individual_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(SIMITParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#number_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_comparison(SIMITParser.Number_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#logical_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operation(SIMITParser.Logical_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(SIMITParser.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SIMITParser#aggregate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function(SIMITParser.Aggregate_functionContext ctx);
}