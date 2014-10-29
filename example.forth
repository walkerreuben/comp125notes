: STAR ( -- )
 42 EMIT :

: STARS ( n -- )
 0 DO STAR LOOP ;

: SQUARE ( n -- )
 DUP 0 DO
 DUP STARS CR
 LOOP DROP ;
