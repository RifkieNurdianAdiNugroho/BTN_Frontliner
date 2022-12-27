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

WebUI.setText(findTestObject('Object Repository/Profile/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Profile/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Profile/button_Masuk                               _2fbfc3'))

WebUI.click(findTestObject('Object Repository/Profile/img'))

WebUI.click(findTestObject('Object Repository/Profile/a_Profile'))

WebUI.click(findTestObject('Object Repository/Profile/input_Nama_name'))

WebUI.click(findTestObject('Object Repository/Profile/a_Back'))

WebUI.click(findTestObject('Object Repository/Profile/img'))

WebUI.click(findTestObject('Object Repository/Profile/a_Profile'))

WebUI.setText(findTestObject('Object Repository/Profile/input_Nama_name'), 'Admin Frontliner Btnssss')

WebUI.click(findTestObject('Object Repository/Profile/button_Cancel'))

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/input_Password_password (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Profile/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Profile/button_Save                            Please wait'))

WebUI.click(findTestObject('Object Repository/Profile/div_data berhasil diupdate'))

WebUI.click(findTestObject('Object Repository/Profile/div_data berhasil diupdate'))

WebUI.click(findTestObject('Object Repository/Profile/img'))

WebUI.click(findTestObject('Object Repository/Profile/a_Sign Out'))

WebUI.setText(findTestObject('Object Repository/Profile/input_Email_email'), 'manager_1@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Profile/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Profile/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Profile/img_1'))

WebUI.click(findTestObject('Object Repository/Profile/a_Profile'))

WebUI.setText(findTestObject('Object Repository/Profile/input_Nama_name'), 'Steve mccouney')

WebUI.setText(findTestObject('Object Repository/Profile/input_Nomor Telepon_phone'), '083535467345')

WebUI.click(findTestObject('Object Repository/Profile/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Profile/input_Nama_name'), 'Steve kingg')

WebUI.setText(findTestObject('Object Repository/Profile/input_Nomor Telepon_phone'), '083434645')

WebUI.click(findTestObject('Object Repository/Profile/span_Save'))

WebUI.closeBrowser()

