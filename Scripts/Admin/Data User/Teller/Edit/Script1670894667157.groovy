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

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/span_Teller'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Nama_name'), 'tesuatteller33')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/div_Email                                  _7413aa'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Nomor Telepon_phone'), '083453454')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Password_password (1)'), 'R1JJtLx9FQs=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/span_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Nama_name'), 'tesuatteller44')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/div_Email                                  _7413aa'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Nomor Telepon_phone'), '8744563456')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Password_password (1)'), '5A/GS+/5AkE=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Edit Foto_bi bi-x fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Edit Foto_bi bi-x fs-2_1'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Edit Foto_bi bi-pencil-fill fs-7_1'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Nama_name'), 'tesuatteller33')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Nomor Telepon_phone'), '08885445646')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Teller/edit/input_Password_password_1'), '12345678')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Password_bi bi-eye fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Teller/edit/span_Save'))

WebUI.closeBrowser()

