pipeline {
    agent {
        label 'docker-slave'
        }
   environment {
    registry = "aneeshgopalakrishna/trial"
    registryCredential = ‘dockerhub’
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
