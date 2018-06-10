del *.class


set path_oryg=%path%

rem set path=%path%;D:\JAVA\jre1.8.0_171\bin;

set path=%path%;D:\JAVA\jdk1.8.0_171\bin
rem set JAVA_HOME=D:\JAVA\jdk1.8.0_171\
rem set CLASSPATH=D:\JAVA\jdk1.8.0_171\lib\

:: JAVA_
:: D:\JAVA\jdk1.8.0_171\bin

javac Cards.java
pause
IF NOT EXIST Cards.class goto :END

java Cards

:END

set path=%path_oryg%
pause