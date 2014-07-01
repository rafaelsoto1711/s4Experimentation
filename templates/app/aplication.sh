./s4 s4r -a=app.app -b=`pwd`/build.gradle app
./s4 deploy -s4r=`pwd`/build/libs/app.s4r -c=cluster1 -appName=app
