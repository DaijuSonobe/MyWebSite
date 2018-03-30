INSERT INTO days_to_shipping (days_to_shipping) VALUE ('即日');
INSERT INTO days_to_shipping (days_to_shipping) VALUE ('1日～3日');
INSERT INTO days_to_shipping (days_to_shipping) VALUE ('1週間以内');

INSERT INTO delivery_defrayment (delivery_defrayment) VALUE ('出品者負担(配送料込み)');
INSERT INTO delivery_defrayment (delivery_defrayment) VALUE ('購入者負担');

INSERT INTO delivery_method (delivery_method) VALUE ('ゆうパック');
INSERT INTO delivery_method (delivery_method) VALUE ('普通郵便(定型・定形外)');
INSERT INTO delivery_method (delivery_method) VALUE ('クロネコヤマト');
INSERT INTO delivery_method (delivery_method) VALUE ('佐川急便');
INSERT INTO delivery_method (delivery_method) VALUE ('クリックポスト');
INSERT INTO delivery_method (delivery_method) VALUE ('その他');

INSERT INTO main_category (name) VALUE ('衣料品(女の子)');
INSERT INTO main_category (name) VALUE ('衣料品(男の子)');
INSERT INTO main_category (name) VALUE ('日用品');
INSERT INTO main_category (name) VALUE ('おもちゃ');

INSERT INTO sub_category (category_id, name) VALUE ('1', 'トップス');
INSERT INTO sub_category (category_id, name) VALUE ('1', 'パンツ');
INSERT INTO sub_category (category_id, name) VALUE ('1', 'スカート');
INSERT INTO sub_category (category_id, name) VALUE ('1', 'ワンピース');
INSERT INTO sub_category (category_id, name) VALUE ('1', 'アウター');
INSERT INTO sub_category (category_id, name) VALUE ('1', '下着/肌着');
INSERT INTO sub_category (category_id, name) VALUE ('1', 'パジャマ');
INSERT INTO sub_category (category_id, name) VALUE ('1', '靴');
INSERT INTO sub_category (category_id, name) VALUE ('1', '小物');
INSERT INTO sub_category (category_id, name) VALUE ('1', 'その他');
INSERT INTO sub_category (category_id, name) VALUE ('2', 'トップス');
INSERT INTO sub_category (category_id, name) VALUE ('2', 'ボトムス');
INSERT INTO sub_category (category_id, name) VALUE ('2', 'アウター');
INSERT INTO sub_category (category_id, name) VALUE ('2', '下着/肌着');
INSERT INTO sub_category (category_id, name) VALUE ('2', 'パジャマ');
INSERT INTO sub_category (category_id, name) VALUE ('2', '靴');
INSERT INTO sub_category (category_id, name) VALUE ('2', '小物');
INSERT INTO sub_category (category_id, name) VALUE ('2', 'その他');
INSERT INTO sub_category (category_id, name) VALUE ('3', 'ミルク');
INSERT INTO sub_category (category_id, name) VALUE ('3', 'ベビー食');
INSERT INTO sub_category (category_id, name) VALUE ('3', 'ベビー食器');
INSERT INTO sub_category (category_id, name) VALUE ('3', '抱っこひも');
INSERT INTO sub_category (category_id, name) VALUE ('3', 'ベビーカー');
INSERT INTO sub_category (category_id, name) VALUE ('3', 'チャイルドシート');
INSERT INTO sub_category (category_id, name) VALUE ('3', '小物');
INSERT INTO sub_category (category_id, name) VALUE ('3', 'その他');
INSERT INTO sub_category (category_id, name) VALUE ('4', '絵本');
INSERT INTO sub_category (category_id, name) VALUE ('4', '知育玩具');
INSERT INTO sub_category (category_id, name) VALUE ('4', 'その他');

INSERT INTO size (size) VALUE ('なし');
INSERT INTO size (size) VALUE ('～50');
INSERT INTO size (size) VALUE ('～60');
INSERT INTO size (size) VALUE ('～70');
INSERT INTO size (size) VALUE ('～80');
INSERT INTO size (size) VALUE ('～90');
INSERT INTO size (size) VALUE ('～100');
INSERT INTO size (size) VALUE ('～110');
INSERT INTO size (size) VALUE ('～120');
INSERT INTO size (size) VALUE ('不明・その他');

INSERT INTO status (status) VALUE ('中古');
INSERT INTO status (status) VALUE ('ほぼ新品');
INSERT INTO status (status) VALUE ('新品');


