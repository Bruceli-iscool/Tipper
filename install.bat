@echo off
set CURRENT_DIR=%~dp0
set DEST_DIR=C:\Program Files\Tipper\
if not exist "%DEST_DIR%" mkdir "%DEST_DIR%"
xcopy "%CURRENT_DIR%*" "%DEST_DIR%" /E /H /C /I /Q /Y