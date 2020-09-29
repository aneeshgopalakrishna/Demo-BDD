pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
       
         
        stage('Build') { 
           
            steps {
                 sh '''
            docker build -t newimage1
            
            '''
            }
        }
    }
}
