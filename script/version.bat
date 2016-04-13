@ECHO OFF

cd %~dp0
rem set bat script path
cd ..
set batPath=%cd%

set /p version=please input new version��
echo.


cd %batPath%\commons
call mvn versions:set -DnewVersion=%version%

cd %batPath%\plugins\mq
call mvn versions:set -DnewVersion=%version%
cd %batPath%\plugins\cache
call mvn versions:set -DnewVersion=%version%
cd %batPath%\plugins\jpush
call mvn versions:set -DnewVersion=%version%

cd %batPath%\base
call mvn versions:set -DnewVersion=%version%

cd %batPath%\web
call mvn versions:set -DnewVersion=%version%

cd %batPath%\tool\raml-parser
call mvn versions:set -DnewVersion=%version%

pause