@echo off
echo Compilando...
javac -encoding UTF-8 -cp "lib\*" -d bin src\Conexion\DataBase.java src\Formularios\*.java src\CargaDeUsuarios\*.java src\App.java
if %errorlevel% neq 0 (
    echo Error en la compilacion
    pause
    exit /b %errorlevel%
)

echo.
echo Ejecutando...
java -cp "bin;lib\mysql-connector-j-9.5.0.jar" App
echo.
pause
