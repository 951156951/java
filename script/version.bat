@ECHO OFF

cd %~dp0
rem set bat script path
cd ..
set batPath=%cd%

set /p version=�������°汾�ţ�
echo.


cd %batPath%\commons
call mvn versions:set -DnewVersion=%version%

cd %batPath%\base
call mvn versions:set -DnewVersion=%version%

cd %batPath%\web
call mvn versions:set -DnewVersion=%version%


pause