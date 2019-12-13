import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input_Email address_email_create'), 
    'asdadd@otest.pl')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/label_Mr'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/label_Mrs'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__customer_firstname'), 
    'T222')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__customer_lastname'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/span_Register'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/li_You must register at least one phone number'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__customer_firstname'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/li_firstname is invalid'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__customer_lastname'), 
    'D22')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__email'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__email'), 'asdadd')

WebUI.setEncryptedText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__passwd'), 
    'J40AX0PwJB8=')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/div_Date of Birth--123456789101112131415161_90e777'))

WebUI.selectOptionByValue(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/select_-20192018201720162015201420132012201_c04d20'), 
    '2014', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/select_-20192018201720162015201420132012201_c04d20'), 
    '1900', true)

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/label_Receive special offers from our partners'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/label_Sign up for our newsletter'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__lastname'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input_Company_company'), 
    'ddd')

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__address1'), 'aa222')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/html_Login - My Store  var CUSTOMIZE_TEXTFI_f94380'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__address1'), '222')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/p_City'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/p_City'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__city'), '222')

WebUI.selectOptionByValue(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '17', true)

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__postcode'), '2222')

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/textarea_Additional information_other'), 
    '2')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input_Home phone_phone'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__phone_mobile'), '222')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/span_Register'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/div_Create an accountThere are 5 errorslast_31eea5'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__customer_lastname'), 
    'test')

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__email'), '@otest.pl')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/html_Login - My Store  var CUSTOMIZE_TEXTFI_f94380_1'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__email'), 'test@o2.pl')

WebUI.setEncryptedText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__passwd'), 
    'P9ET2sDE0SE=')

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__phone_mobile'), '2222222')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/span_Register'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/div_Create an accountThere are 4 errorsAn a_5ec8c3'))

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__customer_firstname'), 
    'test')

WebUI.setEncryptedText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__passwd'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/input__postcode'), '22222')

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/span_Register'))

WebUI.click(findTestObject('Object Repository/register fail, validation/Page_Login - My Store/li_An account using this email address has _5b8fcd'))

