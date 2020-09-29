pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
       
         
        stage('Build') { 
           
            steps {
                dir('FinalDemoOfDocker'){
                    
                 sh label:'' ,script: 'mvn package'
                
          
            
            
            }
        }
    }
}
