pipeline {
    agent {
         agent { label 'trial' }
    }
    stages {
       
         
        stage('Build') { 
            steps {
                 sh '''
            cd FinalDemoOfDocker
            mvn package
            '''
            }
        }
    }
}
