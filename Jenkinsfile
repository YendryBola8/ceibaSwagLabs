pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                sh 'git checkout https://github.com/YendryBola8/ceibaSwagLabs.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'  // Compilar el proyecto Maven
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test' // Ejecutar las pruebas Selenium
            }
        }

        stage('Deploy') {
            when {
                // Definir cuando debe ocurrir esta etapa (por ejemplo, después de un push a cierta rama)
                expression { currentBuild.resultIsBetterOrEqualTo('SUCCESS') }
            }
            steps {
                // Implementar tu aplicación si es necesario
                // Puedes agregar aquí los comandos para implementar en tu entorno
            }
        }
    }

    post {
        always {
            // Limpiar y liberar recursos (si es necesario)
            cleanWs()
        }
    }
}
