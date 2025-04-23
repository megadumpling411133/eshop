// 取得 Email 欄位
const emailInput = document.getElementById('loginId');

// 封裝 Email 格式檢查函式
function validateEmail(inputElement) {
  const value = inputElement.value.trim();
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; 

  if (value !== '' && !emailRegex.test(value)) {
    alert('請輸入正確的 Email 格式');
	console.log("請輸入正確的 Email 格式");
    inputElement.value = '';   
    inputElement.focus();      
    return false;
  }
  console.log('Email 格式正確：', value);
  return true;
}

// 當欄位失去焦點時執行檢查
emailInput.addEventListener('blur', function() {
  validateEmail(emailInput);
});
