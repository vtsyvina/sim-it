grammar SIMIT;

mainblock throws GrammarParseException:
    initEnv
    initPop?
    'rules:'
    rules
    ;
initEnv:
    'init_environment:' initIterations initEnvVar? (initEnvVar)*;
initIterations:
    'iterations' '=' NUMBER ';';
initPop:
    'init_population:'
    popSize
    initPopVar? ( initPopVar)*;

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


number_expression:
number_expression operation number_expression|
    (PLUS|MINUS)? NUMBER |
    (PLUS|MINUS)? IDENTIFIER |
//    aggregate_function |
    OP number_expression CP |
    rand_function | max_function | min_function
    ;
operation:
    '+' | '-' | '*' | '/' | '^' | '%';
PLUS:
    '+';
MINUS:
    '-';
rand_function:
    'rand' OP number_expression ',' number_expression CP;
max_function:
    'max' OP number_expression ',' number_expression CP;
min_function:
    'min' OP number_expression ',' number_expression CP;
//MULTIPLY:
//    '*';
//DIVIDE:
//    '/';
//POWER:
//    '^';
boolean_expression:
    BOOL |
    number_expression number_comparison number_expression |
    OP boolean_expression CP |
    boolean_expression logical_operation boolean_expression |
    NOT boolean_expression |
    ;
number_comparison:
    '==' | '<' | '>' | '>=' | '<=';
logical_operation:
    '&&' | '||' | '==' | '!=';

NOT:
    '!';
if_rule:
IF boolean_expression '{'
rules
'}' |
IF boolean_expression '{'
rules '}' ELSE '{'
rules '}'
;

ELSE:
    'else';

aggregate_function:
    'avg' OP IDENTIFIER CP
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
