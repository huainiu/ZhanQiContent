package name.yumao.zhanqi.swing;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import name.yumao.zhanqi.mina.ContentMinaThread;
import name.yumao.zhanqi.http.HttpClientFromZhanqi;
import name.yumao.zhanqi.utils.HexUtils;
import name.yumao.zhanqi.vo.RoomFlashvars;



public class Danmu extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel nameLabel=new JLabel("请输入房间号：");
	JButton butnSure=new JButton("连接");
	JLabel supLabel=new JLabel(" 小助手交流反馈群 56444647");
	JTextField inNum=new JTextField(10);
	public Danmu(){
		super("战旗TV评论小助手");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		setIconImage(toolkit.createImage(HexUtils.HexString2Bytes("89504E470D0A1A0A0000000D4948445200000038000000380806000000A8863B1E000000017352474200AECE1CE900000006624B474400FF00FF00FFA0BDA793000000097048597300000B1300000B1301009A9C180000000774494D4507DE071F000E261234E4550000001974455874436F6D6D656E74004372656174656420776974682047494D5057810E1700000DCB4944415468DEED99799455D59587BF7DEE9BA957D44015732132168A82CAEC808A388B31B1A3249D689BB4D051125B9BB6ED38AD3669A3DD89AD3844B31C708A0A6A144D8C43020E5494852C41700802856015C5AB2A6A7AC3BDE7ECFEE3BE2A0B8369E9A6D772B9EAB7D65BEFDE73DEBBEF7C67EFB3F73EE7419FFAD4A73EF5A94F7DEA539FBEA492AF0AC821336E31C011C0D67757FF687777BBF92AC04D98FE8B347093AA8EE80DF795009C30FD17E380E70023224F7E695CB4F6BBCBD322FA1D1CBFDAB8F41BF9FD76C9E9B7C411AE52D52B813745E4DC7757FFA8E1FF0DF08104269CC5F0990A88E27C0F775127DAFBB3E37FB0622241B012ABE5E2DC0728FF2EEA9E50AB01CE059B1E3ECFEE351973EF1609AC277E10C1B795A017A8F0CF82A45535072CDC5877D9FD0734C82C4D12010603035046208C41198250A6101525A742A3716C4C581E3B372038E4D227C57AC96F89750FA06AB0AAEA9C601D626D8B587D559D5D2781FB80C0EE26705D1A04A5F876A804760CBE9D861FCC40358208A8AA88AC56D5A337D65DA6FB1A6764BF2D95E430518E5198098C078601D5BDA74B00151007F1805B6D3CFD04413B36597AAD5877A51A634455314EC4091851152947EC5962F52C750A9E51512D883371F5149C229E036750EB5454511055BDE5F3E0F6DB820F24384184A52EB45A5C8A0F1001145590E22FA91A0AA55D5C500DCB8F06FFE0EBEA1E49E43ACE7322825315552170E01C58875A07814502AB125851DF42E0200890C0A2BE55E35BD12040FC00750AB06363DD65C3FEDA98F7CB820217A932C40812118888E049772056AC824529A08583BA983D1BEA58A5D1512BDF7A3D5EE89CE9E2F1701A9C0ACE82086A05110897AEA28AE0148900AAA026B49E5151E31063C01815E704E186FF69CC5F18F0FE042355981C058919434C044F04538C298A8A0502E7D68DEFD47993A17EC8AD1F8E2C5955F7B8873DCA26E28AAAA084567302C622222882A805F5C0039C099F18318853F0B4F81D03EA502B122E41EE3B608051E1E888C8D88418E2C6E0891091306C866B01D4D9E5E5795938199A06DFB6F990D2F65DBF2622873A1345BA978353B0823A17DA4CBB3B14D4212AA88680E2148C827160048CA0228808883CBD71F50FF30704F0B114294FCCDCB8182F618CC644A4DB8280AA88181B3C4A4E2F9C1CD87CFABEE6D1E53B37BDE6A2D132F50C1851407014076B10EB5082A2631667C875BBA3438D20467ADE3106158788282282679EFE2263FF428071F1AA2322F392C610372271E31115514F4299207874C29EC27C80EA251F4D1AF0C9A6B53611473CA3182362A4682445AD419C23346904D5A0971B8680388318255C7302620017463331821140561F30C0A8C89C9831E9A4F1346144E2C6684C8C7802A2EEF6912DD94B0086DFFCCE8CF49E86176C3C26E219D58827E2096A4C18A2B4681D2B3D2B579C09DDD51541A41BA4FBDE863E6CC2260DC3F6FB22D276C00023C62C4E1843DC33921421EE45A4C45962817F7359736E31C0F09FAD9B52926B5BE662D13446548D11F10C1AF1502F8CB4A21ABA1C456B19D3E3B2E13BBDE07AE5A0EE97E96E97AD88C91D10C0AD704463501853EA4189837CAA4C07173A89FBC14F4DBBFE18A0EAC60D83D39DBB9F77F1D80015A3628CE019D4F320629068F8336A8B81C57988D55E5672218D4811F233609FCDDC223B11CD1F10C02D25A97F335181689C8E5892C97B764A7B49F9B26426731D377C587950765779AABDA1CEC612958820C5BCD1ED5601061521E2851D1AB89E4A67AF3A4308D3C5A7F1B6579F7CF6B32D20FEFF0970D249779E9D2171EF7985AE722F1653539A96941770ED3BBFFCEDBF9E74CDEBC9C56BFDCAF69D98640C4DC5C9741434918A493A164105DAF21667A17FDA232AC29E82259F0FF0024B34709840C9E7032804E007787E40DA0BD3857EB6C4522DC6DA1E7519EBDCFF1AF0CE3B56CBBF2C5975726D6DB2FCCA2BCEA1AD60E53FEE5F4B6B36CF4FE65E3D757B43FB09C71D6CB969F12CDEF8B099450F6DE09E8B8F94FAB6024BD7EEC20F94B9E32B193520C5D7C797D13FEEF19B8FDA79FEA336CE1859C2F1C34B68CD062C5FDF440C30D6E1A96359DDC774FA8EB84AC8F39760C576F6D1B11F80F73CB9AE269B0F8E3BE7E4719C357D900272FCF8FE58D0A64E5779C3836BF887336BF5C891E5D29E0BB8E99B13F8DEAC61DCFDC6C734ECC973F84165DC37EFE0BD9EB9F0B00A2E9850465484AEC032B622C1D4A125C54C2F34B6E5B9E5B93F5319973055748FDFF54085ED0AA04EDC17E2DB37E0B68F5BC70DAA48D59E71FC6800F9606B0B99B61C91A8276B3ECCF0D43527A01AAEA2D9B555CCAEADA2B12DCFFD6FECA05F54E8CAFAF856D9D95E60C18A2DB4F98E83FAC7B87EF630CA1311966FC8B0FE93762A131EB55549AC556E7F71338908C43C70810B73A3D3623D1A5E2BA8A0224A79E09908E0EF37E0C459B70CD8B9ABF3FCF1A32A1958D54F73795F667EFB51325D3E24624C993888964E9FEF9F368ED25484AB1F5D4FA7551ABB2C3B32597205C7D88A18514F189C8E71DDEC617802AF6C6DA3CB778CAE88F0DD23AAF0A48A88F9344A5EF9C886707BE25BC43AB016B10114AF71D689756D38D78AEF6F8A3766F67F0D4E3AF6B611D95CE181F6B6DCAC938F1B4579FFA4DCB6740D990F76513D71086515FDD8F6491BF7AE788FABCE3F8C475FDDC61FD6ECE4E27326F070DD0EFCBC4F3EEFB864E65002A7ACFC730B470D4F539E8AF2C8DA46469655B3BBC3E73FFF584FA11070E971C3195A9660D143EBD50581947ABA51F341A7581727B081F16D4E72858C64739F4847F6FD48A6758DE9CABEFBD6B69B325FB486DE0BB0900F16E572C171375F7F0AE77FFD700564F4887296FCFC4CAAAAD33CBD6A0B8FBFBC99BF3BBD16804DF5ADDC7FC52C069527B96ED9463A2D1C3AB084A3479553DF9C63D113EFF1CCC59358B9B995773E6E231D8F908EC3DFCF1C4257DE32B87F8255EF6778F0D57A3938C5F64CCDE8ABB325A533BC42C143F011C9ABE7656C3C960FD26944DDE91A8D7E54DE7AF9B192CB8F1270AAFA4CF3C2112DDD0C15776E1311391D2851D5BD01B76E6F3DFB9413C7B0E8E2993D49EAD4E346A1AAE47DCBD2159BB0BE65D6A1D5EC6ACD3165543987D4F4E7CC9FACA2654F0E2F1EE5AC8955443CE1A58D4D4C1DDA8F315529163DBE890BA70C4155B963653DEBB6EEE1C2A387111F5CC22BEF3651EE397C893F9E2D29BD1C91991A8B5AED15254DC197D8EE0C401663AEC5B97B809355D50732C08A5E188B55F5C6E2F54F7B8E0D8F9CBDE4B4AE8E7CE505F38F04E0AE7BEB983EF72E165DF35B4484D56FEFE4F5351F535D9E64C6C44194A6A29C3175382FACD9C18A555BA9294BD0CFC0DF4C19828870DFCA6D9C38B682A6F6024D2D59BE35753005AB0C2A8D33AA3A4959BF280DAD395E5CD740C206B40F1AB4CE45A359638337D4B90D386770CE8873DBC5B93FA1FAB6C030ACF550B5E11E46222292EA65BD1344A41BEE6111F9718F05B76C6B3DA5B6B6BAFFA973C6D2B8AB837BEF7B93B75E7B8FF3CF9D04C08BAF6FA175472B279D3A9ECAD20400F942C03FDEF1278655A5E8ECCC533BB494A11549B63675B1BDA19DF9D38672FD6FDEE79891FD01686CCD31241DE5F8313554A4E3BCBCBE91ED0DEDF457DDBCE3AAC90F010F0154DC557F85C08D403B302FB3A0667D2F8828D011E67F4544AA8BED638115AA0AF0B6885C9E5950A306E0D8D37E39B4B9A573DA99A7D4128918366F6D66D3B6560E9A7430DF9B7F042D7B720C1F98E6E5C7FF96DBAF3AA1C717963CB591C6A6762A52110A399F53270DA2BC24C68D4F6D62E6C8FE4422860983FBB1F8F431A82A5D05CB965D5DEC6A2B7C5A9D05013EE6EE1E80BBEAE3A2FA35C2BDFDE6DE7000CD0B47F822D21A567002505579577D4244EE1791A4886445644166414D634F90F9685BEBB8AAAA7E47CEFFC6E158EBF8F9AD7FA063FB87CC3F7B1EA95494B7EAB631797C35D38F1C46F7CCBDB0BA9E1B6EFA235DC9289B3A0AF477307DDC0000EE5EB69ED54BCE6073433B434BE30C2C8D23228C1F9266DCE012009AF6E478F3BD5D12647D174DC79EED55921E8DC8D8E2EDBDFB8A8CAADA24129E6FA96A87882C066614EF17342F1CF1664F149D36E78EC886F7769D34F58861DE88E1E52A2232EFCCC3983973345F3B630222C2EF5EFA80FB1E5BC7909A729E7FE07C0656F6239BF3F9E1C553A92C4B629D904C4538E690813C5BB79DF3668F64DAD801BCB07627AFAC6BE0A8D195F8CEF14FF7AEE5FB73473365EC009E7CA35EFF6BD9BBD2CF9317FB1969E835F859C080EEA26A9F875FA1050320222297A8EAA062D71DCD0B472CDD2B4DECCE74C64B4B62F34F9B3396821F48532660DE69B5186328F801EB3736F0EB27D6D192E9A4A4244EB6CBD78CE992E3A70C67EE8C11147D1E10B635B6B375C71EEEB96C261BB6346354B9EA9B87D291F379E6B57A963FFB1E17CD19CDEE3D39A68DAE946C478E5449ECA5B5BF3AA7A5E89E95A23A474388E5990535FEE758B04D4402558D02354557FD7D6641CD0FFE220FC6E391D9F178A4E6E9E737F2DC8BEF779F37160F769486C60E8C670AE34755FECE8A9CFAED4B9F8C265231AC318867C2CDAC67309EA13D17D0990F78F0F9F7C9FA9644DCA3AC2441CEB76C6B68A77A4092CB6F7B839827B4B4E518908C36A43CF37AAF911F8AC8316191CD8D7F257FE78B01A67B82370117EF33D18BC879407677A62B6F9DEBDEA88547B88AF13CB33D958CFE2C11F11EEB2CF837EE6EEAF88E1AF18878D00D684248F14CDE8B78EDADCD9D1562C4E4BB8496E62C02261531BF17E76C63C39E1355891820EEC95B2E4B5DAFF5370D5826224B5575EDE79ECF8AD403F5404C44B2C0659905355BFBFEEEED539FFAD4A73EF5A94F7DEAD39749FF0D3D587AC4608B3C6B0000000049454E44AE426082")));
		setBounds(500, 200, 320, 180);
		setVisible(true);
		setResizable(false); 
		setLayout(null);
		addWindowListener(new WindowHandler());
		nameLabel.setBounds(45, 20, 100, 25);
		nameLabel.setFont(new Font("微软雅黑",Font.BOLD,13));
		add(nameLabel);
		inNum.setBounds(45, 50, 100, 60);
		inNum.setFont(new Font("微软雅黑",Font.BOLD,32));
		add(inNum);
		butnSure.setBounds(160,30,100,80);
		butnSure.setFont(new Font("微软雅黑",Font.BOLD,32));
		add(butnSure);
		butnSure.addActionListener(this);
		add(supLabel);
		supLabel.setFont(new Font("微软雅黑",Font.BOLD,13));
		supLabel.setBounds(40,85,250,80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//最小化到任务栏
		PopupMenu popupMenu = new PopupMenu();
		MenuItem openDouyuContent = new MenuItem("打开");
		MenuItem exitDouyuContent = new MenuItem("退出");
		//打开按钮
		openDouyuContent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 setExtendedState(JFrame.NORMAL);
                 setVisible(true);
			}
		});
		//退出按钮
		exitDouyuContent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//添加到菜单
		popupMenu.add(openDouyuContent);
		popupMenu.add(exitDouyuContent);
		SystemTray tray = SystemTray.getSystemTray();
		TrayIcon trayIcon = new TrayIcon(toolkit.createImage(HexUtils.HexString2Bytes("89504E470D0A1A0A0000000D49484452000000100000001008060000001FF3FF61000000017352474200AECE1CE900000006624B474400FF00FF00FFA0BDA793000000097048597300000B1300000B1301009A9C180000000774494D4507DE071F000F2B759EA9A90000001974455874436F6D6D656E74004372656174656420776974682047494D5057810E17000001DC4944415438CBED92414853711CC7BFBFFFDE7BF3BD39AB2D27192C3590B2D00895154541100CBAE921BA74E96497181E84A00842A8CB42A8D988100FE121CC8B1DA24350D482A4301C584AEA2021756BBEBD6DEFEDBDFFAF43048D6E1DA3CFF5CBF7035FF802FFF92B0EC592FEAE58F2340028BF07133A0C48B411A11F80BAD5DA35998EDF9E865D6BA7AA7D03DB956F9437CF4AD71B01B3FF0F8160BC082AA29701DE69C98ED18BE94572BD7D6455C1C094703C40D7406625997D9B70EA04770DA14555B52FAC2ADBCFDA4F74DF3F3FFA4E68BEDDB05D3001E4BA60BB06521410F8FAAFDE4F418269FDC1E147B186CDFCE5BEE12BCB47FA17E0F305386030BB1611139A1401F2115815E56C2661D609BA3FDCEB1898CF0CDC995DE2ABC72393B90A73676B131485281A54B1B655C1A5B10CD863C063AE9BAD47AEF9A3CD8D9F6667DE63EEF52285830DB8F9384BB90D0BE5B283CD92C34FE7BE3A25A3F149351C4A1562470777A5567B0120945A3DA8088D4E8DDD3A27CC528D237B77D072AE88FD0101B360A1678F01CF95343EB3302F4F1E9B00F800039FC1FC313CBEF6504AF94A899FE9BCF0F2CD0A7F59C953A839E8AC6F58DA604F0B7C760DD3CF97D012D2E17E2F0F11CBB4208A4BCF2B0A2174662E1686DAA6FE815BFF007FECC6123B4035500000000049454E44AE426082")),"战旗TV评论小助手",popupMenu);
		MouseAdapter iconAdap = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2){
					setExtendedState(JFrame.NORMAL);
					setVisible(true);
				}
			}
		};
		trayIcon.addMouseListener(iconAdap);
		//防止程序崩溃 甩出错误信息
		try {
			tray.add(trayIcon);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == butnSure) {
			inNum.setEditable(false);
			butnSure.setEnabled(false);
			//获取战棋flashvars
			RoomFlashvars flashVars = HttpClientFromZhanqi.QueryZhanqiVars(inNum.getText());
			//拉起弹幕获取进程
			ContentMinaThread contentMina;
			try {
				contentMina = new ContentMinaThread(flashVars,inNum,butnSure);
				Thread contentMinaThread = new Thread(contentMina);
				contentMinaThread.start();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	//窗口最小化将面板可见性关闭
	class WindowHandler extends WindowAdapter {
		public void windowIconified(WindowEvent e) {
			dispose();
		}
	}
}