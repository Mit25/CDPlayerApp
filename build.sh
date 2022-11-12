if [ $# -ne 1 ]     # ToDo: Support zero no. of arugunment as release target
    then
        echo "Error: Illegal no. of argunments are passed"
        exit 1
elif [ $1 == 'release' -o $1 == 'clean' ]
    then
        rm -rf build
        if [ $1 == 'release' ]
            then
                mkdir build build/target build/.tmp
                find -name "*.java" > build/.tmp/sources
                javac -cp "libs/*:build/target" -d build/target @build/.tmp/sources
        fi
else
    echo "Error: Argunment not supported"
    exit 2
fi