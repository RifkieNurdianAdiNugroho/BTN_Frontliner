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

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Email_email'), 'admin@frontliner-btns.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/span_User'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/span_Manager'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.doubleClick(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Nama_name'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Nama_name'), 'Awesam')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/div_Email                                  _7413aa'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Nomor Telepon_phone'), '083462345235')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Password_password (1)'), 'qqMTnQhNkxk=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/a_Back'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/svg'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/svg_1'))

WebUI.doubleClick(findTestObject('Object Repository/Admin/Data User/Manager/Edit/svg'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/label_Edit Foto_btn btn-icon btn-circle btn_caf665'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Nama_name'), 'awesam')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/div_Email                                  _7413aa'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Nomor Telepon_phone'), '082352344')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Password_password (1)'), 'ME3YMOAB820=')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/i_Password_bi bi-eye-slash fs-2 (1)'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/button_Cancel'))

WebUI.doubleClick(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Nama_name'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Nama_name'), 'awesam')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/div_Email                                  _7413aa'))

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Nomor Telepon_phone'), '082345235')

WebUI.setText(findTestObject('Object Repository/Admin/Data User/Manager/Edit/input_Password_password_1'), 'awesam')

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/span_Save'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/a_Actions'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/i_Edit Foto_bi bi-pencil-fill fs-7'))

WebUI.click(findTestObject('Object Repository/Admin/Data User/Manager/Edit/span_Save'))

WebUI.closeBrowser()

