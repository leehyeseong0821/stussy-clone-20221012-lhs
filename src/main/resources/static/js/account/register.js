const registerButton = document.querySelector("account-button");

registerButton.onclick = () =>{
    
    const accountInputs = document.querySelectorAll("account-input");

    let user = {
        lastName: accountInputs[0].value,
        firstName: accountInputs[1].value,
        email: accountInputs[2].value,
        password: accountInputs[3].value
    }

    let ajxOption = {
        async:false,                //필수
        type:"post",                //필수
        url: "/api/account/register",//필수
        data: user,                  //전송할 데이터가 있으면
        datType: "json",            //json외 text 등을 사용할 수 있지만 json 사용함
        succss: (response)=>{
            alert("회원가입 요청 성공");   //성공시에 실행될 메소드
        },
        error: (error) =>{                //실패시에 실행될 메소드
            alert("회원가입 요청 실패");
        }
    }


    $.ajax(ajxOption);
}