# Create configurations for following- 
# Project Name
# Application Name
# Java Source Code location
# Build Target location
# Library files location
# Webapp Resources location

if [ $# -ne 1 ]     # ToDo: Support zero no. of arugunment as release target
    then
        echo "Error: Illegal no. of argunments are passed"
        exit 1
elif [ $1 == 'release' -o $1 == 'clean' ]
    then
        # Remove older build folder
        rm -rf build
        if [ $1 == 'release' ]
            then
                # Step-0: Create project build folder
                mkdir build build/.tmp build/CDPlayerApp build/CDPlayerApp/WEB-INF build/CDPlayerApp/WEB-INF/classes 

                # Step-1: Copy web resources
                cp -r webapp/* build/CDPlayerApp

                # Step-2: Copy library jars
                cp -r lib build/CDPlayerApp/WEB-INF

                # Step-3: Compile Java source code
                find -name "*.java" > build/.tmp/sources
                javac -cp "lib/*:build/CDPlayerApp//WEB-INF/classes" -d build/CDPlayerApp//WEB-INF/classes @build/.tmp/sources

                # Step-4: Create Web Archive
                cd build/CDPlayerApp
                jar -cf CDPlayerApp.war *
                cd ../..
                exit 0
        fi
else
    echo "Error: Argunment not supported"
    exit 2
fi