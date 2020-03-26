grammar SIMIT;

mainblock throws GrammarParseException:
    initEnv
    initPop
    'rules:'
    rules
    ;
initEnv:
    'init_environment:' initIterations initEnvVar (initEnvVar)*;
initIterations:
    'iterations' '=' NUMBER ';';
initPop:
    'init_population:'
    popSize
    initPopVar ( initPopVar)*;
initEnvVar:
    IDENTIFIER '=' (PLUS|MINUS)? NUMBER ';';
initPopVar:
    IDENTIFIER '=' (PLUS|MINUS)? NUMBER ';';
popSize:
    'size=' NUMBER ';';
assignment:
    IDENTIFIER '=' number_expression ';';

ru:
     if_rule | assignment;

rules:
    ru (ru)*;

// d=d-5; - causes problem line 13:3 extraneous input '-5' expecting ';'
number_expression:
    (PLUS|MINUS)? NUMBER |
    IDENTIFIER |
    aggregate_function |
    OP number_expression CP |
    number_expression operation number_expression
    ;
operation:
    '+' | '-' | '*' | '/' | '^';
PLUS:
    '+';
MINUS:
    '-';
//MULTIPLY:
//    '*';
//DIVIDE:
//    '/';
//POWER:
//    '^';
boolean_expression:
    BOOL |
    number_expression '==' number_expression |
    number_expression '<' number_expression |
    number_expression '>' number_expression |
    number_expression '<=' number_expression |
    number_expression '>=' number_expression |
    OP boolean_expression CP |
    boolean_expression logical_operation boolean_expression |
    '!' boolean_expression |
    ;
logical_operation:
    '&&' | '||' | '==';
if_rule:
IF boolean_expression '{'
rules
'}'
;

aggregate_function:
    'avg(' IDENTIFIER ')'
    ;

NUMBER
   : INT ('.' [0-9] +)? EXP?
   ;

fragment INT
   : '0' | [1-9] [0-9]*
   ;

fragment EXP
   : [Ee] [+\-]? INT
   ;

BOOL:
    'true' | 'false';

OP:
    '(';

CP:
    ')';

IF:
    'if';
IDENTIFIER:
    [A-Za-z0-9_]+;

WS
    :   [ \t\r\n]+ -> skip
    ;
