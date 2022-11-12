if [ $# -eq 0 ]
    then
        java -cp "build/CDPlayerApp/WEB-INF/lib/*:build/CDPlayerApp/WEB-INF/classes" com.mypackage.main.CDPlayerMain
        exit 0
elif [ $# -eq 1 ]
    then
        if [ $1 == 'server' ]
            then
                echo "Deploying Application..."
                wget "http://deployer:pwd@localhost:8080/manager/text/deploy?war=file:path/CDPlayerApp.war&path=/CDPlayerApp" -O - -q
                echo "You can access the application here: http://localhost:8080/CDPlayerApp"
                exit 0
        elif [ $1 == 'undeploy' ]
            then
                echo "Undeploying Application..."
                wget http://deployer:pwd@localhost:8080/manager/text/undeploy?path=/CDPlayerApp -O - -q
        else
            echo "Error: Argunment not supported"
            exit 1
        fi
fi