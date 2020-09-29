pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
        stage('Build'){
            withMaven(maven:'mvn'){
                dir('FinalDemoOfDocker'){
                 sh  "mvn package"
                }
            }
        }
    }
}

                
          
            
    

