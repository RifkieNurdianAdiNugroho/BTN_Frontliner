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

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Email_email'), 'FinanceServies1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Finance Service/add/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Finance Service/add/i_Password_bi bi-eye-slash fs-2'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/span_Submission'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/a_Actions'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/rect'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Kategori                      _4acc33'), 
    'nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Tipe                          _a91877'), 
    'personal', true)

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nama_name'), 'adiaksa')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Alamat_address'), 'krajan kejayan')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Telepon_phone'), '0823523542')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Whatsapp_whatsapp'), '0834562354')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Email_email (1)'), 'adiaksa')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'SWASTA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih pendapatan                    _23fb65'), 
    'Rp2.500.000 sampai Rp5.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jenis Layanan                 _e56fa6'), 
    'kpr', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jenis Layanan                 _e56fa6'), 
    'multiguna', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jenis Layanan                 _e56fa6'), 
    'multimanfaat', true)

WebUI.click(findTestObject('Object Repository/Finance Service/add/label_Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/textarea_Detail Potensi_potential_description'), 'tess')

WebUI.click(findTestObject('Object Repository/Finance Service/add/div_Submit                                 _1c1fc5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Kategori                      _4acc33'), 
    'non_nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Tipe                          _a91877'), 
    'personal', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jenis Layanan                 _e56fa6'), 
    'kpr', true)

WebUI.doubleClick(findTestObject('Object Repository/Finance Service/add/div_Jenis Layanan_separator mb-6'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/div_Jenis Layanan_separator mb-6'))

WebUI.doubleClick(findTestObject('Object Repository/Finance Service/add/div_Jenis Layanan_separator mb-6'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/div_Jenis Layanan_separator mb-6'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/div_Jenis Layanan_separator mb-6'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/div_Jenis Layanan_separator mb-6'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nama_name'), 'adiaksa')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Alamat_address'), 'krajan kejayan')

WebUI.click(findTestObject('Object Repository/Finance Service/add/input_Nomor Telepon_phone'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Telepon_phone'), '08235213234')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Whatsapp_whatsapp'), '32425235345')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Email_email (1)'), 'adiaksa@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'SWASTA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'WIRASWASTA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih pendapatan                    _23fb65'), 
    'Rp5.000.000 sampai Rp10.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jenis Layanan                 _e56fa6'), 
    'multiguna', true)

WebUI.click(findTestObject('Object Repository/Finance Service/add/div_Jenis Layanan_col-md-9 offset-md-3'))

WebUI.doubleClick(findTestObject('Object Repository/Finance Service/add/div_Jenis Layanan_row'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/label_Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/textarea_Detail Potensi_potential_description'), 'tes')

WebUI.click(findTestObject('Object Repository/Finance Service/add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/svg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Kategori                      _4acc33'), 
    'nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Tipe                          _a91877'), 
    'personal', true)

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nama_name'), 'regagsi')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Alamat_address'), 'kejayan sladi')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Telepon_phone'), '08346345235')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Whatsapp_whatsapp'), '087366845633')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Email_email (1)'), 'regagsi@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'PNS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih pendapatan                    _23fb65'), 
    'Rp5.000.000 sampai Rp10.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih pendapatan                    _23fb65'), 
    'Rp2.500.000 sampai Rp5.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jenis Layanan                 _e56fa6'), 
    'modal_kerja_commercial', true)

WebUI.click(findTestObject('Object Repository/Finance Service/add/label_Funding'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/textarea_Detail Potensi_potential_description'), 'MKK')

WebUI.click(findTestObject('Object Repository/Finance Service/add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/a_Actions'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/a_Edit'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/svg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Kategori                      _4acc33'), 
    'non_nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Tipe                          _a91877'), 
    'badan_usaha', true)

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nama_name'), 'panca aji')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Alamat_address'), 'sladi ranggeh')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Telepon_phone'), '08674567456')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Whatsapp_whatsapp'), '08634567346')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Email_email (1)'), 'adiator@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'WIRASWASTA', true)

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nama Perusahaan_company_name'), 'adiator mobil')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jabatan                       _665c11'), 
    'KOMISARIS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih pendapatan                    _23fb65'), 
    'Rp2.500.000 sampai Rp5.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jenis Layanan                 _e56fa6'), 
    'modal_kerja_commercial', true)

WebUI.click(findTestObject('Object Repository/Finance Service/add/label_Pembiayaan'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/input_Funding_potential_category'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/div_Funding'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/input_Funding_potential_category'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/input_Funding_potential_category'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/textarea_Detail Potensi_potential_description'), 'tessss')

WebUI.click(findTestObject('Object Repository/Finance Service/add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/a_Add Nasabah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Kategori                      _4acc33'), 
    'non_nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Kategori                      _4acc33'), 
    'nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Tipe                          _a91877'), 
    'badan_usaha', true)

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nama_name'), 'panca aji')

WebUI.click(findTestObject('Object Repository/Finance Service/add/input_Alamat_address'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Alamat_address'), 'kejayan warungdowo')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Telepon_phone'), '08634756345')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nomor Whatsapp_whatsapp'), '08663463465')

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Email_email (1)'), 'panca@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'LAINNYA', true)

WebUI.click(findTestObject('Object Repository/Finance Service/add/input_Nama Perusahaan_company_name'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'SWASTA', true)

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nama Perusahaan_company_name'), 'regaksa kaca')

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jabatan                       _665c11'), 
    'STAFF', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih pendapatan                    _23fb65'), 
    '< Rp2.500.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Finance Service/add/select_Pilih Jenis Layanan                 _e56fa6'), 
    'multimanfaat', true)

WebUI.click(findTestObject('Object Repository/Finance Service/add/input_Funding_potential_category'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/textarea_Detail Potensi_potential_description'), 'funding')

WebUI.click(findTestObject('Object Repository/Finance Service/add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/a_Actions'))

WebUI.click(findTestObject('Object Repository/Finance Service/add/a_Edit_1'))

WebUI.setText(findTestObject('Object Repository/Finance Service/add/input_Nama_name'), 'mursida')

WebUI.click(findTestObject('Object Repository/Finance Service/add/button_Submit                              _00b7a5'))

WebUI.closeBrowser()

