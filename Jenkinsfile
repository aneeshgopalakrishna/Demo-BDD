pipeline {
    agent {
        label 'docker-slave'
        }
   environment {
    registry = "aneeshgopalakrishna/trial"
    registryCredential = "Vasista@123"
  }
    
   
    stages {
        stage('Build'){
           
                steps{
                    
                dir('FinalDemoOfDocker'){
                    script {
          docker.build registry + ":$BUILD_NUMBER"
                    }
                }
                }
        }
    }
}
