./s4 newCluster -c=cluster2 -nbTasks=1 -flp=13000
./s4 s4r -a=$1.adapter -b=`pwd`/build.gradle adapter
./s4 deploy -s4r=`pwd`/build/libs/adapter.s4r -appClass=$1.adapter -p=s4.adapter.output.stream=input -c=cluster2 -appName=adapter

