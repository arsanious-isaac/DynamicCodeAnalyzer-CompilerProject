<div align="center">
  <h1>Dynamic Java Code Analyzer</h1>
  <h3>A group project for Compiler Course</h3>
  <p>
  <a href="https://github.com/Louis3797/awesome-readme-template/graphs/contributors">
    <img src="https://img.shields.io/badge/contriburtors-5-green" alt="contributors" />
  </a>
  <a href="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/commits/main">
    <img src="https://img.shields.io/badge/last%20commit-april%202023-blue" alt="last update" />
  </a>
  </p>
  <p>
    <a href="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/graphs/contributors">
      <img src="https://contrib.rocks/image?repo=Clara-Raef/DynamicCodeAnalyzer-CompilerProject" />
    </a>
  </p>
</div>


## :star2: About the Project
 <p>
  This is a dynamic code analyzer for Java Programming Language to generate statement and branches code coverage reports.
 </p>

**Statement coverage VS. Branch coverage**

```
if(a || b || (c && d && !e)) {
    test1 = true;
} else {
    test2 = false;
}
```
- **Statement Coverage:** when our code says that test1 and test2 are hit.
- **Branch Coverage:** to test the cases when a is true, when a is false but b is true, when a and b are false but c and d are true and e is false, and so on.

_100% branch coverage => 100% statement coverage, while 100% statement coverage does not imply 100% branch coverage_

## System Flow
<div align="center">
  <p>
      <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/a37dbdb7e06cc7c6f18c848b9164ab0bd0ac0dea/Delivery3/flowchart.png" />
  </p>
</div>

## :gear: Built With
*Java
*IntelliJ
*ANTLR plug-in
*CSS & HTML


## :compass: Roadmap

* [x] Delivery 1
* [x] Delivery 2
* [x] Delivery 3


### :camera: Screenshots

<div align="center"> 
  <img src="https://placehold.co/600x400?text=Your+Screenshot+here" alt="screenshot" />
</div>



<!-- Installation -->
###  Installation

Install my-project with npm

```bash
  yarn install my-project
  cd my-project
```
   
<!-- Running Tests -->
### :test_tube: Running Tests

To run tests, run the following command

```bash
  yarn test test
```



<!-- Usage -->
## :eyes: Usage

Use this space to tell a little more about your project and how it can be used. Show additional screenshots, code samples, demos or link to other resources.


```javascript
import Component from 'my-project'

function App() {
  return <Component />
}
```
