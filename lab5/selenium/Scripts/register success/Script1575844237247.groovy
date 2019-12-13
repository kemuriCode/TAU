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

WebUI.rightClick(findTestObject('Object Repository/div_Sign inContact usCall us now 0123-456-789'))

WebUI.click(findTestObject('Object Repository/a_Sign in'))

WebUI.setViewPortSize(360, 640)

WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email_create'), 'asdasd@dwadaw.pl')

WebUI.click(findTestObject('Object Repository/span_Create an account'))

WebUI.click(findTestObject('Object Repository/input_Mrs_id_gender'))

WebUI.setText(findTestObject('Object Repository/input__customer_firstname'), 'dasd')

WebUI.setText(findTestObject('Object Repository/input__customer_lastname'), 'dsa')

WebUI.setEncryptedText(findTestObject('Object Repository/input__passwd'), 'KHFf8tqwI/0=')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_-12345678910111213141516171819202122_51e29d'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_-20192018201720162015201420132012201_c04d20'), '2012', 
    true)

WebUI.click(findTestObject('Object Repository/input_Company_company'))

WebUI.setText(findTestObject('Object Repository/input__address1'), 'aaaa')

WebUI.click(findTestObject('Object Repository/input_Address (Line 2)_address2'))

WebUI.setText(findTestObject('Object Repository/input__city'), 'Gdansk')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), '53', 
    true)

WebUI.setText(findTestObject('Object Repository/input__postcode'), '11231')

WebUI.click(findTestObject('Object Repository/input__postcode'))

WebUI.setText(findTestObject('Object Repository/input__phone_mobile'), '123123123')

WebUI.click(findTestObject('Object Repository/span_Register'))

WebUI.click(findTestObject('Object Repository/span_My addresses'))

WebUI.closeBrowser()

