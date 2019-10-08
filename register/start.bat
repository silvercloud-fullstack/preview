@echo off
set jdk_home="D:\Program Files\Java\jdk1.8.0_74\bin\java.exe"
set jar_path=silvercloud-eureka-7001-1.0-SNAPSHOT.jar

call:startNode 7001
call:startNode 7002
call:startNode 7003

rem 启动节点
:startNode
set port=%1
start "%port%" %jdk_home% -jar %jar_path% --spring.profiles.active=%port%
goto:eof