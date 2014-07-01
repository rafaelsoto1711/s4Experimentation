# primero se debe renombrar la carpeta de los archivos de S4 al nombre "s4Platform"
# almacenamos el path base del proyecto

path=`pwd`
dir=$path"/apps"
echo $1
if [ ! -d "$dir" ]; then
    mkdir apps
fi
cd s4
./s4 newApp $1 -parentDir=$path"/apps"
cd ../apps/$1/src/main/java
rm -R hello
mkdir app
mkdir adapter
cp $path/templates/adapter/adapter.sh $path/apps/$1
cp $path/templates/app/aplication.sh $path/apps/$1
cd $path/bin
java -jar createS4App.jar $path $1