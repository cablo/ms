import React, {useEffect, useState} from 'react';
import {Table} from "antd";
import {FETCH_BASE_URL} from "../App";

export function TeamTable() {
    const [data, setData] = useState<any>([]);

    useEffect(() => {
        (async () => {
            try {
                const response = await fetch(`${FETCH_BASE_URL}/teams`);
                setData(await response.json());
            } catch (e) {
                console.error(e);
            }
        })();
    }, []);


    const columns = [
        {
            title: 'id',
            dataIndex: 'id',
            key: 'id'
        },
        {
            title: 'Name',
            dataIndex: 'name',
            key: 'name'
        },
        {
            title: 'Location',
            dataIndex: 'location',
            key: 'location'
        }
    ];

    return <Table columns={columns} dataSource={data} rowKey="id" pagination={false} loading={!data}/>;
}
