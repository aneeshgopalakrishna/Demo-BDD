pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
        stage('Build'){
            withMaven(maven:'mvn'){
                steps{
                dir('FinalDemoOfDocker'){
                 sh  "mvn package"
                }
                }
            }
        }
    }
}

                
          
            
    

