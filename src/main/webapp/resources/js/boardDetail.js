const update = document.getElementById("update");
const del = document.getElementById("delete");
const frm = document.querySelector("#frm");

//function(){}
//()=>{}

update.addEventListener("click", (e)=>{
    console.log("업데이트");
    e.preventDefault();
    frm.submit();
})

del.addEventListener("click", (e)=>{
    
    e.preventDefault();
    console.log("삭제");
    frm.setAttribute("action", "./delete");
    console.log("삭제");
    frm.setAttribute("method", "post");
    console.log("삭제");
    frm.submit();
});