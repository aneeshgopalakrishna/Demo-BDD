pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
            steps {
                dir('FinalDemoOfDocker'){
                 sh script: 'mvn package'
                }
            }
    }
}

                
          
            
    

