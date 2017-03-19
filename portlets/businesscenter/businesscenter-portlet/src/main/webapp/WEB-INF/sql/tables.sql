create table businesscenter_BusinessUser (
	uuid_ VARCHAR(75) null,
	businessUserId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	email VARCHAR(75) null,
	ownerShip VARCHAR(75) null,
	categoryId LONG,
	phoneNumber VARCHAR(75) null,
	createdDate DATE null,
	createdBy LONG,
	updatedDate DATE null,
	updatedBy LONG
);

create table businesscenter_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);