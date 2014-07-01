cd ../apache-s4-0.6.0-incubating-src/ ; terminator -e "./s4 zkServer -clusters=c=cluster1:flp=12000:nbTasks=1 -clean"&
sleep 2
cd ../Pruebas/App1/EventCounter/ ; terminator -e "sh comp.sh" &&
cd ../ECAdapter/ ; terminator -e "sh adapter.sh" &&
cd ../EventCounter/ ; terminator -e "./s4 node -c=cluster1" &
sleep 3
cd ../ECAdapter/ ; terminator -e "./s4 node -c=cluster2" 


