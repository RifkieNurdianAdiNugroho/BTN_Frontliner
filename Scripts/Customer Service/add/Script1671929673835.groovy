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

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Email_email'), 'CustomerService1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Customer Service/add/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Customer Service/add/span_Password_btn btn-sm btn-icon position-_28d309'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/span_Submission'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/a_Add Nasabah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Kategori                      _4acc33'), 
    'nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Tipe                          _a91877'), 
    'personal', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nama_name'), 'farel')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Alamat_address'), 'banten ')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nomor Telepon_phone'), '083463463456')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nomor Whatsapp_whatsapp'), '083456346344')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Email_email (1)'), 'farel@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'SWASTA', true)

WebUI.click(findTestObject('Object Repository/Customer Service/add/div_Data Nasabah                           _492990'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pendapatan                    _0837fa'), 
    'Rp2.500.000 sampai Rp5.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jenis Layanan                 _848e6b'), 
    'administrasi_daftar_rehabilitasi_nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jenis Layanan                 _848e6b'), 
    'administrasi_daftar_bank_hitam', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jenis Layanan                 _848e6b'), 
    'administrasi_buku_cek', true)

WebUI.click(findTestObject('Object Repository/Customer Service/add/label_Pembiayaan'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/div_Jenis Layanan_col-md-9 offset-md-3'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/div_Jenis Layanan_row'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/div_Jenis Layanan_separator mb-6'))

WebUI.setText(findTestObject('Object Repository/Customer Service/add/textarea_Detail Potensi_potential_description'), 'tess')

WebUI.click(findTestObject('Object Repository/Customer Service/add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/a_Add Nasabah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Kategori                      _4acc33'), 
    'nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Tipe                          _a91877'), 
    'badan_usaha', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nama_name'), 'andika')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Alamat_address'), 'pemalang jawa tengah')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nomor Telepon_phone'), '082323452333')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nomor Whatsapp_whatsapp'), '082352345234')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Email_email (1)'), 'andika@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'SWASTA', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nama Perusahaan_company_name'), 'andika dealer car')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jabatan                       _665c11'), 
    'KOMISARIS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pendapatan                    _0837fa'), 
    'Rp5.000.000 sampai Rp10.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jenis Layanan                 _848e6b'), 
    'administrasi_buku_tabungan', true)

WebUI.click(findTestObject('Object Repository/Customer Service/add/input_Pembiayaan_potential_category'))

WebUI.setText(findTestObject('Object Repository/Customer Service/add/textarea_Detail Potensi_potential_description'), 'tabungaan baru')

WebUI.click(findTestObject('Object Repository/Customer Service/add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/a_Add Nasabah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Kategori                      _4acc33'), 
    'non_nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Tipe                          _a91877'), 
    'personal', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nama_name'), 'salasi')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Alamat_address'), 'puspo')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nomor Telepon_phone'), '083426346434')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nomor Whatsapp_whatsapp'), '082346346234')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Email_email (1)'), 'salasi@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'WIRASWASTA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pendapatan                    _0837fa'), 
    'Rp2.500.000 sampai Rp5.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jenis Layanan                 _848e6b'), 
    'administrasi_buku_tabungan', true)

WebUI.click(findTestObject('Object Repository/Customer Service/add/input_Pembiayaan_potential_category'))

WebUI.setText(findTestObject('Object Repository/Customer Service/add/textarea_Detail Potensi_potential_description'), 'pembia')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jenis Layanan                 _848e6b'), 
    'administrasi_resi_permintaan_pengembalian_bilyet_giro', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/add/textarea_Detail Potensi_potential_description'), 'giro resi')

WebUI.click(findTestObject('Object Repository/Customer Service/add/div_Submit                                 _1c1fc5'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/button_Submit                              _00b7a5'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/rect'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Kategori                      _4acc33'), 
    'non_nasabah', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Tipe                          _a91877'), 
    'badan_usaha', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nama_name'), 'yera')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Alamat_address'), 'priuk jaktim')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nomor Telepon_phone'), '085235234563')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nomor Whatsapp_whatsapp'), '085235623452')

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Email_email (1)'), 'yera@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'PNS', true)

WebUI.click(findTestObject('Object Repository/Customer Service/add/div_Data Nasabah                           _492990'))

WebUI.click(findTestObject('Object Repository/Customer Service/add/input_Nama Perusahaan_company_name'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pekerjaan                     _3f9458'), 
    'SWASTA', true)

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Nama Perusahaan_company_name'), 'botani pupuk mangrove')

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jabatan                       _665c11'), 
    'STAFF', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Pendapatan                    _0837fa'), 
    'Rp2.500.000 sampai Rp5.000.000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Customer Service/add/select_Pilih Jenis Layanan                 _848e6b'), 
    'administrasi_buku_cek', true)

WebUI.click(findTestObject('Object Repository/Customer Service/add/label_Pembiayaan'))

WebUI.setText(findTestObject('Object Repository/Customer Service/add/textarea_Detail Potensi_potential_description'), 'tess')

WebUI.click(findTestObject('Object Repository/Customer Service/add/button_Submit                              _00b7a5'))

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Data_form-control form-control-solid _bdc5aa'), 
    'yera')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/add/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Data_form-control form-control-solid _bdc5aa'), 
    'salasi')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/add/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Data_form-control form-control-solid _bdc5aa'), 
    'salasi')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/add/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Customer Service/add/input_Data_form-control form-control-solid _bdc5aa'), 
    'salasi')

WebUI.sendKeys(findTestObject('Object Repository/Customer Service/add/input_Data_form-control form-control-solid _bdc5aa'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

