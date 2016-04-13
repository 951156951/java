@ECHO OFF

cd %~dp0
rem set bat script path
cd ..
set batPath=%cd%


cd %batPath%\commons
call mvn clean install -Dmaven.test.skip=true

cd %batPath%\plugins\mq
call mvn clean install -Dmaven.test.skip=true
cd %batPath%\plugins\cache
call mvn clean install -Dmaven.test.skip=true
cd %batPath%\plugins\jpush
call mvn clean install -Dmaven.test.skip=true

cd %batPath%\base
call mvn clean install -Dmaven.test.skip=true

cd %batPath%\tool\raml-parser
call mvn clean install -Dmaven.test.skip=true

pause