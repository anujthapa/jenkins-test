import groovy.json.JsonSlurperClassic
httpRequest url: 'http://localhost:8080/job/test-job/api/json', outputFile: 'output.json'

def jsonFile = readFile(file: 'output.json')
def data = new JsonSlurperClassic().parseText(jsonFile)
latestBuildNumber = "${data.lastSuccessfulBuild.number}"
