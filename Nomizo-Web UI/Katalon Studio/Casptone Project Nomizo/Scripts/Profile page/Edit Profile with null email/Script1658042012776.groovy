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

WebUI.setText(findTestObject('Object Repository/Login/input__Username'), GlobalVariable.UserUsername)

WebUI.click(findTestObject('Login/Field_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input__Password'), GlobalVariable.UserPassword)

WebUI.click(findTestObject('Login/button_Masuk'))

WebUI.click(findTestObject('Profile Page/div_User Banner'))

WebUI.click(findTestObject('Profile Page/Profile page'))

WebUI.click(findTestObject('Profile Page/div_Edit Profile'))

WebUI.sendKeys(findTestObject('Profile Page/Input_username baru'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Profile Page/Input_username baru'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Profile Page/Input_username baru'), 'M-chan')

WebUI.setText(findTestObject('Profile Page/input_deskripsi profile (Optional)'), 'Saya senang memakai Kaca Mata')

WebUI.sendKeys(findTestObject('Profile Page/input_email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Profile Page/input_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Profile Page/input_email'), '')

WebUI.setText(findTestObject('Profile Page/input_jenis kelamin'), 'female')

WebUI.scrollToElement(findTestObject('Profile Page/button_unggah foto'), 0)

WebUI.verifyElementNotClickable(findTestObject('Profile Page/button_ubah profile'))

WebUI.verifyElementPresent(findTestObject('Profile Page/Alert_masukan email'), 0)

WebUI.closeBrowser()

