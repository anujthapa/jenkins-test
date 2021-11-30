pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                println("dry_Run"+env.dryRun)
            }
        }
    }
}
