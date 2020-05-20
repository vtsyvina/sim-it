// Generated from C:/Users/vyach/projects/sim-it/src/main/java/sim/antlr\SIMIT.g4 by ANTLR 4.8
package sim.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SIMITLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, PLUS=27, MINUS=28, NOT=29, ELSE=30, NUMBER=31, BOOL=32, 
		OP=33, CP=34, IF=35, IDENTIFIER=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "PLUS", "MINUS", "NOT", "ELSE", "NUMBER", "INT", "EXP", "BOOL", 
			"OP", "CP", "IF", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'rules:'", "'init_environment:'", "'iterations'", "'='", "';'", 
			"'init_population:'", "'size='", "'*'", "'/'", "'^'", "'%'", "'rand'", 
			"','", "'max'", "'min'", "'=='", "'<'", "'>'", "'>='", "'<='", "'&&'", 
			"'||'", "'!='", "'{'", "'}'", "'avg'", "'+'", "'-'", "'!'", "'else'", 
			null, null, "'('", "')'", "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PLUS", "MINUS", "NOT", "ELSE", "NUMBER", "BOOL", "OP", 
			"CP", "IF", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SIMITLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SIMIT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u010a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \6 \u00d4\n"+
		" \r \16 \u00d5\5 \u00d8\n \3 \5 \u00db\n \3!\3!\3!\7!\u00e0\n!\f!\16!"+
		"\u00e3\13!\5!\u00e5\n!\3\"\3\"\5\"\u00e9\n\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u00f6\n#\3$\3$\3%\3%\3&\3&\3&\3\'\6\'\u0100\n\'\r\'\16\'"+
		"\u0101\3(\6(\u0105\n(\r(\16(\u0106\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\2E\"G#I$K%M&O\'\3"+
		"\2\b\3\2\62;\3\2\63;\4\2GGgg\4\2--//\6\2\62;C\\aac|\5\2\13\f\17\17\"\""+
		"\2\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5X\3\2\2\2\7j\3\2\2\2\tu"+
		"\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17\u008a\3\2\2\2\21\u0090\3\2\2\2\23\u0092"+
		"\3\2\2\2\25\u0094\3\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009d\3"+
		"\2\2\2\35\u009f\3\2\2\2\37\u00a3\3\2\2\2!\u00a7\3\2\2\2#\u00aa\3\2\2\2"+
		"%\u00ac\3\2\2\2\'\u00ae\3\2\2\2)\u00b1\3\2\2\2+\u00b4\3\2\2\2-\u00b7\3"+
		"\2\2\2/\u00ba\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c1\3\2\2"+
		"\2\67\u00c5\3\2\2\29\u00c7\3\2\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00d0"+
		"\3\2\2\2A\u00e4\3\2\2\2C\u00e6\3\2\2\2E\u00f5\3\2\2\2G\u00f7\3\2\2\2I"+
		"\u00f9\3\2\2\2K\u00fb\3\2\2\2M\u00ff\3\2\2\2O\u0104\3\2\2\2QR\7t\2\2R"+
		"S\7w\2\2ST\7n\2\2TU\7g\2\2UV\7u\2\2VW\7<\2\2W\4\3\2\2\2XY\7k\2\2YZ\7p"+
		"\2\2Z[\7k\2\2[\\\7v\2\2\\]\7a\2\2]^\7g\2\2^_\7p\2\2_`\7x\2\2`a\7k\2\2"+
		"ab\7t\2\2bc\7q\2\2cd\7p\2\2de\7o\2\2ef\7g\2\2fg\7p\2\2gh\7v\2\2hi\7<\2"+
		"\2i\6\3\2\2\2jk\7k\2\2kl\7v\2\2lm\7g\2\2mn\7t\2\2no\7c\2\2op\7v\2\2pq"+
		"\7k\2\2qr\7q\2\2rs\7p\2\2st\7u\2\2t\b\3\2\2\2uv\7?\2\2v\n\3\2\2\2wx\7"+
		"=\2\2x\f\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7k\2\2|}\7v\2\2}~\7a\2\2~\177\7r"+
		"\2\2\177\u0080\7q\2\2\u0080\u0081\7r\2\2\u0081\u0082\7w\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7p\2\2\u0088\u0089\7<\2\2\u0089\16\3\2\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7k\2\2\u008c\u008d\7|\2\2\u008d\u008e\7g\2\2"+
		"\u008e\u008f\7?\2\2\u008f\20\3\2\2\2\u0090\u0091\7,\2\2\u0091\22\3\2\2"+
		"\2\u0092\u0093\7\61\2\2\u0093\24\3\2\2\2\u0094\u0095\7`\2\2\u0095\26\3"+
		"\2\2\2\u0096\u0097\7\'\2\2\u0097\30\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7c\2\2\u009a\u009b\7p\2\2\u009b\u009c\7f\2\2\u009c\32\3\2\2\2\u009d\u009e"+
		"\7.\2\2\u009e\34\3\2\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2"+
		"\7z\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7?\2\2\u00a8\u00a9\7?\2\2\u00a9\"\3"+
		"\2\2\2\u00aa\u00ab\7>\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad&\3\2"+
		"\2\2\u00ae\u00af\7@\2\2\u00af\u00b0\7?\2\2\u00b0(\3\2\2\2\u00b1\u00b2"+
		"\7>\2\2\u00b2\u00b3\7?\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7(\2\2\u00b5\u00b6"+
		"\7(\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7~\2\2\u00b8\u00b9\7~\2\2\u00b9.\3"+
		"\2\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\7?\2\2\u00bc\60\3\2\2\2\u00bd\u00be"+
		"\7}\2\2\u00be\62\3\2\2\2\u00bf\u00c0\7\177\2\2\u00c0\64\3\2\2\2\u00c1"+
		"\u00c2\7c\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7i\2\2\u00c4\66\3\2\2\2\u00c5"+
		"\u00c6\7-\2\2\u00c68\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8:\3\2\2\2\u00c9\u00ca"+
		"\7#\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce"+
		"\7u\2\2\u00ce\u00cf\7g\2\2\u00cf>\3\2\2\2\u00d0\u00d7\5A!\2\u00d1\u00d3"+
		"\7\60\2\2\u00d2\u00d4\t\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\5C\"\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db@\3\2\2\2\u00dc\u00e5\7\62\2\2"+
		"\u00dd\u00e1\t\3\2\2\u00de\u00e0\t\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e5B\3\2\2\2"+
		"\u00e6\u00e8\t\4\2\2\u00e7\u00e9\t\5\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\5A!\2\u00ebD\3\2\2\2\u00ec\u00ed"+
		"\7v\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f6\7g\2\2\u00f0"+
		"\u00f1\7h\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7u\2\2"+
		"\u00f4\u00f6\7g\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6F\3\2"+
		"\2\2\u00f7\u00f8\7*\2\2\u00f8H\3\2\2\2\u00f9\u00fa\7+\2\2\u00faJ\3\2\2"+
		"\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7h\2\2\u00fdL\3\2\2\2\u00fe\u0100\t"+
		"\6\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102N\3\2\2\2\u0103\u0105\t\7\2\2\u0104\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\b(\2\2\u0109P\3\2\2\2\f\2\u00d5\u00d7\u00da\u00e1"+
		"\u00e4\u00e8\u00f5\u0101\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}