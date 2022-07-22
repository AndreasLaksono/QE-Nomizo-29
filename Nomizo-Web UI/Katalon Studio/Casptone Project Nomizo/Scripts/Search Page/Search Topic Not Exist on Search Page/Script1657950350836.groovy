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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/Field_Username'))

WebUI.setText(findTestObject('Login/input__Username'), GlobalVariable.UserUsername)

WebUI.click(findTestObject('Login/Field_Password'))

WebUI.setEncryptedText(findTestObject('Login/input__Password'), GlobalVariable.UserPassword)

WebUI.click(findTestObject('Login/button_Masuk'))

WebUI.click(findTestObject('Search Page/Page_frontend-vue - frontend-vue/Search Page'))

WebUI.setText(findTestObject('Search Page/Page_frontend-vue - frontend-vue/input_search page'), 'elfnov')

WebUI.sendKeys(findTestObject('Search Page/Page_frontend-vue - frontend-vue/input_search page'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Search Page/Page_frontend-vue - frontend-vue/div_Topic'))

WebUI.verifyElementPresent(findTestObject('Search Page/Page_frontend-vue - frontend-vue/Alert Message No Data Available Topic'), 
    0)

WebUI.closeBrowser()

