pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
       
         
        stage('Build') { 
           agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
                 sh '''
                 cd FinalDemoOfDocker
            mvn package
            
            '''
            }
        }
    }
}
