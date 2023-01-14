// document.querySelector("#p1").innerHTML = 222222222222222;

function jsFunc1(){
    var pTag = document.querySelector("#p1");
    pTag.innerHTML = "jsFunc1() 함수 실행완료";
}

var jsFunc2 = function(){
    document.querySelector("#p2").innerHTML = "jsFunc2() 함수 실행 완료";
}

function resultJsFunc4(){
    JsFunc4(23, 5, 10);
}

// 자바스크립트에서는 자료형에 따른 타입이 따로 없으므로 var를 적어줄 필요 없다
function JsFunc4(value, value2, value3){
    document.querySelector("#p4").innerHTML = "결과값: " + (value + value2 + value3) + "<br>";
}

function resultJsFunc5(){
    var result = isFunc5();
    // console.log(result);
    document.querySelector("#p5").innerHTML = result;
}

function isFunc5(){
    return Math.floor(Math.random()*100+1);
}

function callFuncTenTimes(otherFunc){
    for(var i = 0; i < 10; i++){
        otherFunc(i);   // calleFunc(0);
                        // calleFunc(1);
                        // ...
                        // calleFunc(9);
    }
}

function calleeFunc(num){
    // console.log(num);
    var pTag = document.querySelector("#p6");
    pTag.innerHTML += (num+1) + "번째 함수 호출 완료 <br>" 
}

callFuncTenTimes(calleeFunc);

function jsReturnFunc(){
    var nameTag = document.querySelector("#name");
    var pTag = document.querySelector("#p7");
    return function(){
        pTag.innerHTML = nameTag.value;
    }();
}