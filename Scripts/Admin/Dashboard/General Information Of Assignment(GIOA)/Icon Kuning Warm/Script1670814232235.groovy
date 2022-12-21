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

WebUI.navigateToUrl('https://frontliner.intermediatech.id/')

WebUI.setText(findTestObject('Object Repository/Admin/Dashboard/General Information Of Assignment(GIOA)/Icon Warm(Kuning)/input_Email_email'), 
    'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Dashboard/General Information Of Assignment(GIOA)/Icon Warm(Kuning)/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Dashboard/General Information Of Assignment(GIOA)/Icon Warm(Kuning)/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Dashboard/General Information Of Assignment(GIOA)/Icon Warm(Kuning)/span_Masuk'))

WebUI.click(findTestObject('Admin/Dashboard/General Information Of Assignment(GIOA)/Icon Warm(Kuning)/a_Warm', [('variable') : 'https://frontliner.intermediatech.id/layanan/assignment_index?type=warm']))

WebUI.click(findTestObject('Object Repository/Admin/Dashboard/General Information Of Assignment(GIOA)/Icon Warm(Kuning)/a_Warm'))

WebUI.closeBrowser()

