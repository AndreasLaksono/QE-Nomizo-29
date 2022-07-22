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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.LinkWeb)

WebUI.click(findTestObject('Register/Link_Daftar'))

WebUI.click(findTestObject('Register/Field_Email'))

WebUI.setText(findTestObject('Register/input__Email'), GlobalVariable.InvalidEmailRegist)

WebUI.click(findTestObject('Register/Field_UsernameRegist'))

WebUI.setText(findTestObject('Register/input__UsernameRegist'), 'UserTest123')

WebUI.click(findTestObject('Register/Field_PasswordRegist'))

WebUI.setEncryptedText(findTestObject('Register/input__PasswordRegist'), 'CJEvo/uscLJAJYTQospgTQ==')

WebUI.click(findTestObject('Register/Field_ConfirmPass'))

WebUI.setEncryptedText(findTestObject('Register/input__ConfirmPass'), 'CJEvo/uscLJAJYTQospgTQ==')

WebUI.verifyElementText(findTestObject('Register/Alert Message Invalid Email'), 'E-mail tidak valid')

WebUI.verifyElementNotClickable(findTestObject('Register/button_Daftar'))

WebUI.delay(5)

WebUI.closeBrowser()

