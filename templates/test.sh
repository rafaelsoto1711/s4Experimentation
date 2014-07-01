cd ../s4/ ; ./s4 zkServer -clusters=c=cluster1:flp=12000:nbTasks=1 -clean &
sleep 2
cd ../apps/test/ ; sh aplication.sh &&
sh adapter.sh &&
./s4 node -c=cluster1 &
sleep 3
./s4 node -c=cluster2